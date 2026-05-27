// Last updated: 5/27/2026, 12:35:43 PM
class TriNode{
    TriNode[] children = new TriNode[26];
    boolean isEnd = false;

}

class Trie {
    private TriNode root;
    public Trie() {
        root = new TriNode();
    }
    
    public void insert(String word) {
        TriNode curr = root;
        for(char c:word.toCharArray()){
            int i=c-'a';
            if(curr.children[i]==null){
                curr.children[i] = new TriNode();
            }
            curr = curr.children[i];
        }
        curr.isEnd = true;
    }
    
    public boolean search(String word) {
        TriNode curr = root;
        for(char c:word.toCharArray()){
            int i = c-'a';
            if(curr.children[i]==null){
                return false;
            }
            curr = curr.children[i];

        }
        return curr.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        TriNode curr = root;
        for(char c:prefix.toCharArray()){
            int i = c-'a';
            if(curr.children[i]==null){
                return false;
            }
            curr = curr.children[i];

        }
        return true;
        
    }
}


