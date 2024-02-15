package Interface;
public class fingLargest {
public Object  findLargest (Object object1, Object object2)  {
    relatable obj1 = (relatable) object1;
    relatable obj2 = (relatable) object2;
    if((obj1).isLargerThan(obj2)>0)
    return object1;
    else
    return object2;
    
}


}
