class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        boolean vis[][]=new boolean[m][n];
        int ans[][]=new int[m][n];
        
        
        Queue<Pair>q=new LinkedList<>();
        
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    q.add(new Pair(i,j));
                    vis[i][j]=true;
                }
            }
        }
        q.add(null);
        int dis=0;
        
        while(!q.isEmpty()){
            if(q.peek()==null){
                q.poll();
                if(q.isEmpty()){
                    break;
                }
                q.add(null);
                dis++;
            }
            else{
                Pair p=q.poll();
                ans[p.row][p.col]=dis;
                System.out.println(p.row+" "+p.col+" "+dis);
                
                
                int lr=p.row;
                int lc=p.col-1;
                if((lr>=0 && lr<m) && (lc>=0 && lc<n)){
                    if(!vis[lr][lc]){
                        q.add(new Pair(lr,lc));
                        vis[lr][lc]=true;
                    }
                }
                
                int rr=p.row;
                int rc=p.col+1;
                if((rr>=0 && rr<m) && (rc>=0 && rc<n)){
                    if(!vis[rr][rc]){
                        q.add(new Pair(rr,rc));
                        vis[rr][rc]=true;
                    }
                }
                
                int ur=p.row-1;
                int uc=p.col;
                if((ur>=0 && ur<m) && (uc>=0 && uc<n)){
                    if(!vis[ur][uc]){
                        q.add(new Pair(ur,uc));
                        vis[ur][uc]=true;
                    }
                }
                
                int dr=p.row+1;
                int dc=p.col;
                if((dr>=0 && dr<m) && (dc>=0 && dc<n)){
                    if(!vis[dr][dc]){
                        q.add(new Pair(dr,dc));
                        vis[dr][dc]=true;
                    }
                }
            }
        }
        
        
        return ans;
        
        
    }
    
    
    class Pair{
        int row;
        int col;
        public Pair(int row,int col){
            this.row=row;
            this.col=col;
        }
    }
}