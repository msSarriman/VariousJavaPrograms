/*
MIT License

Copyright (c) 2019 Emmanouil Sarris

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
/*	12_ReturnUniqueItemsList
Write a function to return a copy of a list with duplicates removed
*/

import java.util.LinkedList;
import java.util.HashSet;

public class ReturnUniqueItemsList<T> {

    protected static<T> void removeDuplicates(LinkedList<T> list) {
        HashSet<T> mySet = new HashSet<>();
        int i = 0;
        while (i < list.size()) {
            if (mySet.contains(list.get(i))) {
                list.remove(i);
            } else {
                mySet.add(list.get(i++));
            }
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(5);
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(7);
        System.out.println(list.toString());
        removeDuplicates(list);
        System.out.println(list.toString());
    }

}