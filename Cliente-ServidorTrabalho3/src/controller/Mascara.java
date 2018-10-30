package controller;

import javafx.scene.control.TextField;

public abstract class Mascara {

	public static void cpfField(TextField textField) {
		Mascara.maxField(textField, 14);
		textField.lengthProperty().addListener((observableValue, number, number2) -> {
			String value = textField.getText();
			value = value.replaceAll("[^0-9]", "");
			value = value.replaceFirst("(\\d{3})(\\d)", "$1.$2");
			value = value.replaceFirst("(\\d{3})(\\d)", "$1.$2");
			value = value.replaceFirst("(\\d{3})(\\d)", "$1-$2");
			try {
				textField.setText(value);
			} catch (Exception ex) {
			}
		});
	}

	public static void maxField(TextField textField, Integer length) {
		textField.textProperty().addListener((observableValue, oldValue, newValue) -> {
			if (newValue == null || newValue.length() > length) {
				textField.setText(oldValue);
			}
		});
	}
}
