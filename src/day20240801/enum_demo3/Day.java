package day20240801.enum_demo3;


public enum Day implements ForEnumDemo {
    MONDAY {
        @Override
        public void desc() {
            System.out.println("星期一: 一脸懵逼");
        }
    },
    TUESDAY {
        @Override
        public void desc() {
            System.out.println("星期二: 前不着村，后不着店");
        }
    },
    WEDNESDAY {
        @Override
        public void desc() {
            System.out.println("星期三: Midweek days are so so");
        }
    },
    THURSDAY {
        @Override
        public void desc() {
            System.out.println("星期四: 加把劲");
        }
    },
    FRIDAY {
        @Override
        public void desc() {
            System.out.println("星期五: 心已放假");
        }
    },
    SATURDAY {
        @Override
        public void desc() {
            System.out.println("星期六: 噢啊");
        }
    },
    SUNDAY {
        @Override
        public void desc() {
            System.out.println("星期天: 哦草，就这...");
        }
    };
}
