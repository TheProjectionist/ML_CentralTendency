import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		
		//Dataset
		int[] data = new int[] {
				365, 601, 407, 470, 710, 729, 33, 55, 62, 571, 769, 470, 127, 226, 334, 661, 974,
				34, 96, 236, 521, 875, 225, 233, 589, 601, 734, 152, 675, 853, 470, 895, 899,
				250, 515, 564, 663, 705, 470, 21, 159, 402, 613, 929, 135, 442, 655, 724, 971,
				76, 411, 601, 532, 820, 918
		};
		
		System.out.println("The medium central tendency of the dataset is " + FindMediumCentralTendency(data));
		System.out.println("The mode central tendency of the dataset is " + FindModeCentralTendency(data));
		System.out.println("The mean central tendency of the dataset is " + FindMeanCentralTendency(data));

	}
	
	public static float FindMeanCentralTendency(int[] dataset) {
		float ct = 0;
		
		for(int i = 0; i < dataset.length; i++) {
			ct += dataset[i];
		}
		
		ct /= (float)dataset.length;
		
		return ct;
	}
	
	public static int FindModeCentralTendency(int[] dataset) {
		int maxCount = 0; 
		int maxValue = 0;
		
		//Find the most common value
		for (int i = 0; i < dataset.length; i++) {
			int count = 0;
			for (int j = 0; j < dataset.length; j++) {
				if (dataset[i] == dataset[j]) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				maxValue = dataset[i];
			}
		}
		
		return maxValue;
	}
	
	public static int FindMediumCentralTendency(int[] dataset) {
		int ct;
		
		//Sort the data from least to greatest
		for (int i = 0; i < dataset.length-1; i++) {
			//switch numbers if the left value is greater
			if (dataset[i] > dataset[i+1]) {
				int temp = dataset[i];
				dataset[i] = dataset[i+1];
				dataset[i+1] = temp;
				//reset loop
				i = -1;
			}
		}
		
		//Get middle of array
		int middle = dataset.length/2;
		ct = dataset[middle];
		
		return ct;
	}

}
