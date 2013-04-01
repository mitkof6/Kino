package util;

import javax.swing.JFileChooser;

/**
 *<p>
 * Η κλάση περιέχει την δημιουργεία ενός αντικειμένου που είναι υπεύθυνο για
 * το άνοιγμα του οδηγού εύρεσης αρχείου.
 * 
 * @author STANEV DIMITAR
 */
public class InputFile {
    
    
    /**
     * String global variable file
     */
    private String file;
       
    /**
     * Constructor
     * 
     * @param null
     */
    public InputFile() {
        getFileOrDirectory();  
    }
    
    /**
     * Get the file
     * 
     * @return the file object 
     */
    public String getFile(){
        return this.file;
    }
    
    /**
     * Private method for opening the file window and passing the resaults to the <code>file</code>
     * 
     */
    private void getFileOrDirectory(){
        JFileChooser fileToOpen = new JFileChooser();
        fileToOpen.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        @SuppressWarnings("unused")
		int resault = fileToOpen.showOpenDialog(null);
        file = fileToOpen.getSelectedFile().getAbsolutePath();
    }
}
