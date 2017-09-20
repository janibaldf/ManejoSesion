
package interfaces;

import java.util.List;


public interface Obligatorio <GenericDTO> {
    public boolean Create(GenericDTO g);
    public boolean Delete(Object key);
    public boolean Update(GenericDTO g);    
    public GenericDTO Read(Object key);    
    public List<GenericDTO> ReadALL(); 
}
