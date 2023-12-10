/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Ngoc
 */
public class Node {
    Product data;
    Node left, right;

    public Node(Product item) {
        data = item;
        left = right = null;
    }
}