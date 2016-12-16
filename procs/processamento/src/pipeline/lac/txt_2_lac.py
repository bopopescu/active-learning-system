# -*- coding: utf-8 -*-
from pipeline import lac
import sys
import codecs

#file_in, stops = sys.argv[1], sys.argv[2].split(',')
file_in = sys.argv[1]
stops = ["a","about","above","after","again","against","all","am","an", 
		"and","any","are","aren't","as","at","be","because","been",
		"before","being","below","between","both","but","by","can't",
		"cannot","could","couldn't","did","didn't","do","does","doesn't",
		"doing","don't","down","during","each","few","for","from",
		"further","had","hadn't","has","hasn't","have","haven't",
		"having","he","he'd","he'll","he's","her","here","here's","hers",
		"herself","him","himself","his","how","how's","i","i'd","i'll",
		"i'm","i've","if","in","into","is","isn't","it","it's","its",
		"itself","let's","me","more","most","mustn't","my","myself", "may",
		"no","nor","not","of","off","on","once","only","or", "one",
		"other","ought","our","ours","ourselves","out","over",
		"own","same","shan't","she","she'd","she'll","she's",
		"should","shouldn't","so","some","such","than","that",
		"that's","the","their","theirs","them","themselves",
		"then","there","there's","these","they","they'd",
		"they'll","they're","they've","this","those","through",
		"to","too","under","until","up","very","was","wasn't",
		"we","we'd","we'll","we're","we've","were","weren't",
		"what","what's","when","when's","where","where's","which",
		"while","who","who's","whom","why","why's","with", "will", "won't",
		"would","wouldn't","you","you'd","you'll","you're","you've",
		"your","yours","yourself","yourselves", "newt"]

with codecs.open(file_in, 'r', 'utf-8')  as f:
	for i, line in enumerate(f):
		parts = line.split('\t')
		print lac.get_line(int(parts[0]), parts[1], ' '.join(parts[2:]), ' ', stops=stops)
		
