package com.kpfu.pm.coffeehouse.dto;

public class OrderDto {


      private long owner_id;
      private long orders_coffeehouse_id;


      public long getOwner_id() {
          return owner_id;
      }

      public void setOwner_id(long owner_id) {
          this.owner_id = owner_id;
      }

      public long getOrders_coffeehouse_id() {
          return orders_coffeehouse_id;
      }

      public void setOrders_coffeehouse_id(long orders_coffeehouse_id) {
          this.orders_coffeehouse_id = orders_coffeehouse_id;
      }

}
