package edu.csu.command;

/**
 * @author yanjuefei
 * @date 2020/5/23 0023
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        Content content = new Content("test");
        AppendComand appendComand = new AppendComand(content);
        CopyCommand copyCommand = new CopyCommand(content);

        appendComand.doit();
        System.out.println(content.s);
        copyCommand.doit();
        System.out.println(content.s);
        copyCommand.undo();
        System.out.println(content.s);
        appendComand.undo();
        System.out.println(content.s);
    }
}

interface Command {
    void doit();
    void undo();
}

class Content {
    String s;

    public Content(String s) {
        this.s = s;
    }
}

class AppendComand implements Command {

    Content c;

    public AppendComand(Content c) {
        this.c = c;
    }

    @Override
    public void doit() {
        c.s += "aaaa";
    }

    @Override
    public void undo() {
        c.s = c.s.substring(0, c.s.length()-4);
    }
}

class CopyCommand implements Command{
    Content c;

    public CopyCommand(Content c) {
        this.c = c;
    }

    @Override
    public void doit() {
        c.s = c.s+c.s;
    }

    @Override
    public void undo() {
        c.s = c.s.substring(0, c.s.length()/2);
    }
}
