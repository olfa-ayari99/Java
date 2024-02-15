package Objects;

public record range(int start , int end) {

    public range(int start, int end ){
        if(end <= start){
            throw new IllegalArgumentException("End cannot be lesser than start");

        }
        if(start<0){
            this.start=0;
        }else{
            this.start= start;
        }
        if(end > 100){
            this.end=10;
        }else{
            this.end=end;
        }
    }


    
}
