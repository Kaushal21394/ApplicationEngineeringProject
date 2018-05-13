/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ChangeSeeker;

import java.util.ArrayList;

/**
 *
 * @author kaush
 */
public class ChangeSeekerDirectory {
    private ArrayList<ChangeSeeker> changeSeekerDirectory;

    public ChangeSeekerDirectory() {
        changeSeekerDirectory=new ArrayList<>();
        
    }

    public ArrayList<ChangeSeeker> getChangeSeekerDirectory() {
        return changeSeekerDirectory;
    }

    public void setChangeSeekerDirectory(ArrayList<ChangeSeeker> changeSeekerDirectory) {
        this.changeSeekerDirectory = changeSeekerDirectory;
    }
    
    public ChangeSeeker addChangeSeeker(){
        ChangeSeeker cs= new ChangeSeeker();
        changeSeekerDirectory.add(cs);
        return cs;
    }
    
    public void removeChangeSeeker(ChangeSeeker cs){
        changeSeekerDirectory.remove(cs);
    }
    
}
