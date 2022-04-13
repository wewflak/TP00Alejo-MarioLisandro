package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Operaciones;
public class controllerOperaciones {
	
	
@GetMapping("/menu")
    
    public String obtenerMenu () {
	
	
	return ("index");
		
}
    @GetMapping("/resolverSuma")
    public String getSuma(@RequestParam(name="num1")int num1,@RequestParam(name="num2")int num2,Model model) {
    	int resultadoS;
    	Operaciones nuevaCalculadora = new Calculadora();
    	nuevaCalculadora.setNum1(num1);
    	nuevaCalculadora.setNum2(num2);
    	resultadoS=nuevaCalculadora.suma();
    	model.addAttribute("resultadoS", resultadoS);
    	
    	
    	
    	return "resultado";
    }      
    
    @GetMapping("/resolverResta")
    public String getResta(@RequestParam(name="num1")int num1,@RequestParam(name="num2")int num2,Model model) {
    	int resultadoR;
    	Operaciones nuevaCalculadora = new Calculadora();
    	nuevaCalculadora.setNum1(num1);
    	nuevaCalculadora.setNum2(num2);
    	resultadoR=nuevaCalculadora.resta();
    	model.addAttribute("resultadoR", resultadoR);
    	
    	
    	
    	return "resultador";
    }      
    
    @GetMapping("/resolverMultiplica")
    public String getMultiplica(@RequestParam(name="num1")int num1,@RequestParam(name="num2")int num2,Model model) {
    	int resultadoM;
    	Operaciones nuevaCalculadora = new Calculadora();
    	nuevaCalculadora.setNum1(num1);
    	nuevaCalculadora.setNum2(num2);
    	resultadoM=nuevaCalculadora.multiplicar();
    	model.addAttribute("resultadoM", resultadoM);
    	
    	
    	
    	return "resultadom";
    }      

     
    @GetMapping("/resolverDivide")
    public String getDivide(@RequestParam(name="num1")int num1,@RequestParam(name="num2")int num2,Model model) {
    	double resultadoD;
    	Operaciones nuevaCalculadora = new Calculadora();
    	nuevaCalculadora.setNum1(num1);
    	nuevaCalculadora.setNum2(num2);
    	resultadoD=nuevaCalculadora.dividir();
    	model.addAttribute("resultadoD", resultadoD);
    	
    	
    	
    	return "resultadod";
    }    
    
    
    @GetMapping("/resolverRaiz")
    public String getRaiz(@RequestParam(name="num1")int num1,Model model,@RequestParam(name="num2")int num2,Model model) {
    	int resultadoRaiz;
    	Operaciones nuevaCalculadora = new Calculadora();
    	nuevaCalculadora.setNum1(num1);
    	nuevaCalculadora.setNum2(num2);
    	resultadoRaiz=nuevaCalculadora.raiz();
    	model.addAttribute("resultadoRaiz", resultadoRaiz);
    	
    	
    	
    	return "resultadoraiz";
    }   
    @GetMapping("/resolverPotencia")
    public String getPotencia(@RequestParam(name="num1")int num1,@RequestParam(name="num2")int num2,Model model) {
    	int resultadoP;
    	Operaciones nuevaCalculadora = new Calculadora();
    	nuevaCalculadora.setNum1(num1);
    	nuevaCalculadora.setNum2(num2);
    	resultadoP=nuevaCalculadora.potencia();
    	model.addAttribute("resultadoP", resultadoP);
    	
    	
    	
    	return "resultadop";
    }      