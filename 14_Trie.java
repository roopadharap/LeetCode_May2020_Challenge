class Trie {
    
    Node root;
    
    class Node
    {
        Node [] lst = new Node[26];
        boolean eow;
        
        Node()
        {
            eow = false;
            
            for(int i = 0; i<lst.length; i++)
                lst[i] = null;
        }
    }
    
    
    /** Initialize your data structure here. */
    public Trie() {
         root = new Node();
    }
       
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
         Node curr = root;
         int idx;
         
         for(int i = 0; i < word.length(); i++)
         {
             idx = word.charAt(i) - 'a';
             if(curr.lst[idx] == null)
             {
                 curr.lst[idx] = new Node();
                 curr = curr.lst[idx];
             }
             else
             {
                 curr = curr.lst[idx];
             }
         }
         curr.eow = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Node curr = root;
         int idx;
         
         for(int i = 0; i < word.length(); i++)
         {
             idx = word.charAt(i) - 'a';
             if(curr.lst[idx] == null)
             {
                 return false;
             }
             else
             {
                 curr = curr.lst[idx];
             }
         }
         if(curr.eow == true)
             return true;
         
         return false;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Node curr = root;
         int idx;
         
         for(int i = 0; i < prefix.length(); i++)
         {
             idx = prefix.charAt(i) - 'a';
             if(curr.lst[idx] == null)
             {
                 return false;
             }
             else
             {
                 curr = curr.lst[idx];
             }
         }
         
         return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */