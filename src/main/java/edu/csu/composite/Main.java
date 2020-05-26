package edu.csu.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yanjuefei
 * @date 2020/5/18 0018
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        Node root = new BranchNode("root");

        BranchNode chapter1 = new BranchNode("chapter1");
        BranchNode part1 = new BranchNode("chapter1 part1");
        Node content1 = new LeafNode("content1");
        Node content2 = new LeafNode("content2");

        part1.addNode(content1);
        part1.addNode(content2);

        chapter1.addNode(part1);
    }
}

interface Node {
    void show();
}

class BranchNode implements Node {
    List<Node> list = new ArrayList<>();
    String content = "";

    public BranchNode(String content) {
        this.content = content;
    }

    public void addNode(Node n) {
        this.list.add(n);
    }

    @Override
    public void show() {
        System.out.println(content);
    }
}

class LeafNode implements Node{
    private String content = "";

    public LeafNode(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public void show() {
        System.out.println(content);
    }
}
