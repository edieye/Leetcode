package Trie;

/**
 * Created by edieye on 2020-04-16.
 */

import java.util.HashMap;

public class Trie {

    /** **/
    /** Initialize your data structure here. */
    Node top;
    public Trie() {
        top = new Node();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        Node curr = top;
        for (int i = 0; i < word.length() ;i++) {
            HashMap<Character, Node> map = curr.map;
            if (!map.containsKey(word.charAt(i))) {
                Node n = new Node();
                map.put(word.charAt(i), n);
            }
            if (i == word.length() - 1) {
                Node isEndNode = map.get(word.charAt(i));
                isEndNode.isEnd = true;
                map.put(word.charAt(i), isEndNode);
            }
            curr = map.get(word.charAt(i));
        }

    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Node curr = top;
        for (int i = 0; i < word.length(); i++){
            HashMap<Character, Node> map = curr.map;
            if (!map.containsKey(word.charAt(i))) {
                return false;
            }
            if (i == word.length() -1) {
                Node isEndNode = map.get(word.charAt(i));
                return isEndNode.isEnd;
            }
            curr = map.get(word.charAt(i));
        }
        return false;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Node curr = top;
        for (int i = 0; i < prefix.length(); i++) {
            HashMap<Character, Node> map = curr.map;
            if (!map.containsKey(prefix.charAt(i))) {
                return false;
            }
            curr = map.get(prefix.charAt(i));
        }
        return true;
    }

    private class Node {
        HashMap<Character, Node> map;
        boolean isEnd;

        Node() {
            map = new HashMap<>();
        }
    }

}
