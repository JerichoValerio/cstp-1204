package permutationcipher;

public class PermutationCipher {

	/**
	 * Encrypts a string by generating a permutation of the characters in the
	 * string. The permutation is specified by permutationArray and the
	 * characters may be permuted more than once depending on the number of
	 * rounds indicated.
	 * 
	 * @param plaintext
	 *                         the text to encrypt.
	 * @param permutationArray
	 *                         the array the specifies how to permute the plain
	 *                         text. A
	 *                         suitable permutation array must be equal in length to
	 *                         the
	 *                         plain text and must be a permutation of integers in
	 *                         [0 ..
	 *                         permutationArray.length-1].
	 * @param rounds
	 *                         the number of rounds of encryption needed; rounds
	 *                         should be at
	 *                         least 1.
	 * @return the encrypted text (ciphertext).
	 * @throws IllegalKeyException
	 *                             if the permutation array is not suitable.
	 */
	public static String encrypt(String plaintext, int[] permutationArray, int rounds) throws IllegalKeyException {
		// todo: Implement this methods

		String encryptedString = plaintext;

		char[] letters = new char[plaintext.length()];

		while (rounds > 0) {
			for (int i = 0; i < encryptedString.length(); i++) {

				letters[permutationArray[i]] = encryptedString.charAt(i);

			}
			rounds--;

			encryptedString = String.valueOf(letters);
		}
		return encryptedString;
		// return "";
		// letters[1] = a first iteration
		// letters[2] = b first iteration
		// letters[0] = c first iteration
	}
}
