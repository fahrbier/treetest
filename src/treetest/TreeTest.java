/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treetest;


import java.util.Random;

/**
 *
 * @author holger
 */
public class TreeTest {
    
    private static final Random random = new Random(2345);

    public static Node createTree(int depth) {
        Node node = new Node(depth);
        int data = random.nextInt();
        node.setData(data);
        System.out.println ("Created node with value " + data + "["+depth+"]");
        
        if (depth > 1) {
            node.addChild(createTree(depth-1));
            node.addChild(createTree(depth-1));
        }
        return node;
    }
           
          
    public static void printTree(Node startNode) {
       
        if (!startNode.isLeaf()) {
            for (int i=0; i < startNode.getChildren().size(); i++) {
                printTree(startNode.getChildren().get(i));
            }      
        }
        System.out.println(startNode.getData() + "[" +startNode.getDepth() + "]");
    
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Node ft = createTree(2);
        
        printTree(ft);
        
    }
    
}