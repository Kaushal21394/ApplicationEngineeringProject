/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.NGO;

/**
 *
 * @author kaush
 */
public class NGO {
 
    private String Name;
    private String ngoid;
    private static int count;

    public NGO() {
        
        ngoid="ORG"+(++count);
        
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getNgoid() {
        return ngoid;
    }

    public void setNgoid(String ngoid) {
        this.ngoid = ngoid;
    }
    
    @Override
    public String toString(){
        
        return Name;
    }
    
    
}


