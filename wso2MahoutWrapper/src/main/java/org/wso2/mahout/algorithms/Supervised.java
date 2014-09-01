package org.wso2.mahout.algorithms;

import java.util.List;

import org.apache.mahout.math.Vector;

public interface Supervised {
	
	public void train(List <Integer> indexSet, List <Integer> responseSet , List <Vector> featureSet, int passes) throws Exception;
	
	public void test(List <Integer> responseSet , List <Vector> featureSet) throws Exception;
	
	public void export(String exportPath) throws Exception;
	
}
