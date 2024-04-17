package org.modelos;

public class CadenaDescuento {
    private CadenaDescuento siguienteDescuento;
    private double porcentajeDescuento;
    private double valorMinimoAplicado;

    CadenaDescuento (double porcentajeDescuento, double valorMinimoAplicado) {
        this.porcentajeDescuento = porcentajeDescuento;
        this.valorMinimoAplicado = valorMinimoAplicado;
    }

    public double aplicarDescuento(double valor){
        double nuevoValor = 0;

        if (valor >= valorMinimoAplicado){
            nuevoValor = valor * (1 - porcentajeDescuento);
        } else {
            nuevoValor = valor;
        }

        if (siguienteDescuento != null){
            return siguienteDescuento.aplicarDescuento(nuevoValor);
        }
        return nuevoValor;
    }

    public CadenaDescuento getSiguienteDescuento() {
        return siguienteDescuento;
    }
    public void setSiguienteCadenaDescuento(CadenaDescuento siguienteDescuento) {
        this.siguienteDescuento = siguienteDescuento;
    }
    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }
    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
    public double getValorMinimoAplicado() {
        return valorMinimoAplicado;
    }
    public void setValorMinimoAplicado(double valorMinimoAplicado) {
        this.valorMinimoAplicado = valorMinimoAplicado;
    }
}
