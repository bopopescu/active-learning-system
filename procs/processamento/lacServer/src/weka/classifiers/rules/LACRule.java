/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package weka.classifiers.rules;

import java.util.List;

/**
 * An associative rule extracted from the training data
 * 
 * @author Adriano Veloso (algorithm and original C++ implementation)
 * @author Gesse Dafe (Java implementation)
 */
public class LACRule
{
	private final float confidence;
	private final float support;
	private final int predictedClass;
	private String[] featuresLabels;
	private String classLabel;

	/**
	 * Constructs a new {@link Rule}
	 * 
	 * @param support
	 * @param confidence
	 * @param predictedClass
	 */
	LACRule(float support, float confidence, int predictedClass)
	{
		this.support = support;
		this.confidence = confidence;
		this.predictedClass = predictedClass;
	}

	/**
	 * @return the support
	 */
	double getSupport()
	{
		return support;
	}

	/**
	 * @return the confidence
	 */
	double getConfidence()
	{
		return confidence;
	}

	/**
	 * @return the predictedClass
	 */
	int getPredictedClass()
	{
		return predictedClass;
	}
	
	@Override
	public String toString()
	{
		return "" + featuresLabels + "->" + classLabel + " supp= " + support + " conf=" + confidence + "";
	}
	public String format()
	{
		return classLabel + "\t" + support + "\t" + confidence + "\t" + featuresLabels;
	}
	public void setPattern(List<String> featuresLabels)
	{
		this.featuresLabels = (String[]) featuresLabels.toArray(new String[featuresLabels.size()]);
	}

	public void setClassLabel(String classLabel)
	{
		this.classLabel = classLabel;
	}
}