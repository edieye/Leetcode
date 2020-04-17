package Trie;

/**
 * Created by edieye on 2020-04-16.
 */

import java.util.HashMap;

public class Trie {
    /** Initialize your data structure here. */
    Node top;
    public Trie() {
        top = new Node();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        Node curr = top;
        for (int i = 0; i < word.length() ;i++) {
            if ()
        }

    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {

    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {

    }

    private class Node {
        HashMap<Character, Node> map;
        boolean isEnd;

        Node() {
            map = new HashMap<>();
        }
    }

}
