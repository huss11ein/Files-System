/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os.files;

import com.sun.corba.se.spi.orbutil.threadpool.ThreadPool;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

/**
 *
 * @author User
 */
public class ReadingFiles implements Runnable  {





    String inputfile;
    File frommain;
    Scanner myFile = null;
    //Scanner variable

   
ReadingFiles(File f) {
        this.frommain = f;
    }
    @Override
    public void run(){
    }


   
   

}
