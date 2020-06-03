class StockSpanner {
    Stack<Pair> p;
    
    class Pair
    {
        int price, range;
        
        Pair(int p, int r)
        {
            price = p;
            range = r;
        }
    }
    
    public StockSpanner() {
        p = new Stack<>();
    }
    
    public int next(int price) {
        int cnt = 1;
        
        while(!p.isEmpty() && p.peek().price <= price)
        {
            cnt = cnt + p.pop().range;
        }
       
        p.push(new Pair(price, cnt));
        
        return cnt;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */