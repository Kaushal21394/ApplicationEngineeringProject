/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ChangeMaker;

import java.util.ArrayList;

/**
 *
 * @author kaush
 */
public class ChangeMakerDirectory {
    
    private ArrayList<ChangeMaker> changeMakerDirectory;

    public ChangeMakerDirectory() {
        changeMakerDirectory= new ArrayList<>();
    }

    public ArrayList<ChangeMaker> getChangeMakerDirectory() {
        return changeMakerDirectory;
    }

    public void setChangeMakerDirectory(ArrayList<ChangeMaker> changeMakerDirectory) {
        this.changeMakerDirectory = changeMakerDirectory;
    }
    
    
    public ChangeMaker addChangeMaker(){
        ChangeMaker cm = new ChangeMaker();
        changeMakerDirectory.add(cm);
        return cm;
    }
    
    public void removeChangeMaker(ChangeMaker cm){
        changeMakerDirectory.remove(cm);
    }
    
}
