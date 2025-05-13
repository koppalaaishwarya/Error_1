import spark.servlet.SparkApplication;

import static spark.Spark.get;

public class Helloworld implements SparkApplication {
	public static void main(String[] args) {
		new Helloworld().init();
	}

	@Override
	public void init() {
		get("/hello", (req, res) -> "Hello world");
	}
}
