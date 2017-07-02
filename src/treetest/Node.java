/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treetest;

import java.util.ArrayList;


/**
 *
 * @author holger
 */
public class Node {
    private int myDepth;
    private int data;
   
    private ArrayList<Node> children = new ArrayList<>();

    Node(int depth) {
        this.myDepth = depth;      
    }
    
    public void setData(int data) {
        this.data = data;
    }
    
    public int getData() {
        return this.data;
    }
    
    public void addChild(Node child) {
        this.children.add(child); 
    }
    
    public boolean isLeaf() {
        return children.isEmpty();
    }
 
    public ArrayList<Node> getChildren() {
        return this.children;
    }
    
    public int getDepth() {
        return this.myDepth;
    }

}