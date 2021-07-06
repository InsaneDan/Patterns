package Facade.baeldung_example;
// понятный, но "нерабочий" пример на https://www.baeldung.com/java-facade-pattern#:~:text=What%20Is%20a%20Facade%3F,the%20facade%20all%20the%20time.

public class CarEngineFacade {
//    public class CarEngineFacade {
//        private static int DEFAULT_COOLING_TEMP = 90;
//        private static int MAX_ALLOWED_TEMP = 50;
//        private FuelInjector fuelInjector = new FuelInjector();
//        private AirFlowController airFlowController = new AirFlowController();
//        private Starter starter = new Starter();
//        private CoolingController coolingController = new CoolingController();
//        private CatalyticConverter catalyticConverter = new CatalyticConverter();
//
//        public void startEngine() {
//            fuelInjector.on();
//            airFlowController.takeAir();
//            fuelInjector.on();
//            fuelInjector.inject();
//            starter.start();
//            coolingController.setTemperatureUpperLimit(DEFAULT_COOLING_TEMP);
//            coolingController.run();
//            catalyticConverter.on();
//        }
//
//        public void stopEngine() {
//            fuelInjector.off();
//            catalyticConverter.off();
//            coolingController.cool(MAX_ALLOWED_TEMP);
//            coolingController.stop();
//            airFlowController.off();
//        }
}
