/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypatterndemo;

/**
 *
 * @author Asmo
 * https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm
 */
public class StrategyPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm
        
        
        Context con = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + con.executeStrategy(10, 5));
        
        con = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + con.executeStrategy(10, 5));
        
        con = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + con.executeStrategy(10, 5));
    }   
}
