import weka.core.Instances;

import weka.core.converters.ArffSaver;
import weka.core.converters.CSVLoader;

import java.io.File;
import java.io.IOException;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class CSV2Arff
{
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param   args
	 * @throws  IOException
	 */
	public static void main(String[] args) throws IOException
	{
		CSVLoader loader = new CSVLoader();
		loader.setSource(new File("house.csv"));
		Instances data = loader.getDataSet();

		ArffSaver saver = new ArffSaver();
		saver.setInstances(data);
		saver.setFile(new File("house-new.arff"));
		saver.writeBatch();
	}
}
