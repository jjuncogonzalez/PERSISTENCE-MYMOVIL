package com.grupomovil.entity.ws;

import java.util.List;


/**
 *
 * @author jeisson.junco
 */
public class EBWs_RatingServiceRequestSelection {
    
    
   public class ListData {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
    
 
   }
 
  public List<ListData> list_data;

    public List<ListData> getList_data() {
        return list_data;
    }

    public void setList_data(List<ListData> list_data) {
        this.list_data = list_data;
    }
  
}
