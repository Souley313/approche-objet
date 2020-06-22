/**
 * 
 */
package fr.diginamic.neuroph;

import org.neuroph.core.data.DataSet;
import org.neuroph.core.data.DataSetRow;
import org.neuroph.nnet.MultiLayerPerceptron;
//import org.neuroph.nnet.learning.BackPropagation;

/**
 * Un réseau de neurones simulant la porte logique OU
 * 
 * @author souleymaneTHIAM
 *
 */
public class NeurophOU {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/** Création d'un réseau de neurone */
		MultiLayerPerceptron neuralNetwork = new MultiLayerPerceptron(2, 4, 1);

		/**
		 * On utilse DataSet pour spécifier la taille du vecteur d'entrée et du vecteur
		 * de sortie résultant
		 */
		DataSet dataSet = new DataSet(2, 1);

		/**
		 * notre objectif dans cet exemple est d'apprendre à notre réseau à effectuer
		 * des opérations avec l'opérateur logique OU
		 */
		DataSetRow rOne = new DataSetRow(new double[] { 0, 1 }, new double[] { 1 });
		dataSet.addRow(rOne);
		DataSetRow rTwo = new DataSetRow(new double[] { 1, 0 }, new double[] { 1 });
		dataSet.addRow(rTwo);
		DataSetRow rThree = new DataSetRow(new double[] { 0, 0 }, new double[] { 0 });
		dataSet.addRow(rThree);
		DataSetRow rFour = new DataSetRow(new double[] { 1, 1 }, new double[] { 0 });
		dataSet.addRow(rFour);
		neuralNetwork.learn(dataSet);

		/**
		 * BackPropagation nous permet de faire apprendre à notre réseau de neurones
		 * de retrouver les vrais resultats (c'est la rétropropagation)
		 */
		// BackPropagation backPropagation = new BackPropagation();
		// backPropagation.setMaxIterations(1000);
		// neuralNetwork.learn(dataSet, backPropagation);
		// System.out.println(neuralNetwork);

		/** Teste du réseau de neurone */
		neuralNetwork.setInput(1, 0); // définir les valeurs d’entrée.
		neuralNetwork.calculate(); // lancer le calcul.
		for (double output : neuralNetwork.getOutput()) { // Recupération de la valeur de sortie
			System.out.println(output);//affichage résultat
		}

	}

}
