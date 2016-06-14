package gower.example.java.newfeatures;

import java.util.*;

public class Colony implements Iterable<Colony.Penguin> {

  static class Penguin {
    String name;
    Penguin(String name) {
      this.name = name;
    }
    public String toString() {
      return "Penguin{" + name + "}";
    }
  }

  Set<Penguin> set = new HashSet<Penguin>();

  public void addPenguin(Penguin p) {
    set.add(p);
  }

  public Iterator<Penguin> getPenguins() {
    return set.iterator();
  }

  public Iterator<Penguin> iterator() {
    return getPenguins();
  }

  public static void main(String args[]) {
    Colony colony = new Colony();
    Penguin opus = new Penguin("Opus");
    Penguin chilly = new Penguin("Chilly Willy");
    Penguin mumble = new Penguin("Mumble");
    Penguin emperor = new Penguin("Emperor");
    colony.addPenguin(opus);
    colony.addPenguin(chilly);
    colony.addPenguin(mumble);
    colony.addPenguin(emperor);
    for (Penguin p : colony) {
      System.out.println(p);
    }
  }
}