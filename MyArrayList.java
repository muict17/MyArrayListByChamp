public class MyArrayList<T>
{
    private T[] element;
	private int numberofElements;

    public MyArrayList() {
    	element = (T[]) new Object[0];
    	numberofElements = 0;
    }

    public void add(T something) {
    	T[] temporary = (T[]) new Object[numberofElements + 1];
    	for (int i = 0; i < numberofElements; i++) {
    		temporary[i] = element[i];
    	}
    	temporary[numberofElements] = something;
    	element = temporary;
    	numberofElements++;
    }

    public void remove(int index) {
        T[] temporary = (T[]) new Object[numberofElements - 1];
        for(int i = 0; i < index; i++) {
        	temporary[i] = element[i];
        }
        for(int i = index; i < numberofElements - 1; i++) {
        	temporary[i] = element[i+1];
        }
        element = temporary;
		numberofElements--;
    }

    public T get(int index) {
        return element[index];
    }
    
	public void printData() {
		for(int i = 0; i < numberofElements; i++) {
			System.out.print(element[i]);
			if(i < numberofElements - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}
	
	public int size() {
		return numberofElements;
	}
}