package utils.enums;

public enum Data {

        ITEM_IN_CART("Televisor"),
        SHIPPIN_METHOD("Selecciona tu método de entrega");

        private String code;

        Data(String code){
            this.code = code;
        }

        public String getCode() {
            return this.code;
        }



    }


