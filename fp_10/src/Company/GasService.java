/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Company;

/**
 *
 * @author dmanu
 */
public interface GasService {
    
    public double getGasPrice();
    
    public void setPrice(double preco);
    
    public double getGasTotal(double litres);
    
}
