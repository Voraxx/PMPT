# Programmiertechnik Sommersemester 2023
## Prof. Dr. Philipp Jenke
### Aufgabe 4


### Objektorientierung

>In diesem Aufgabenblatt arbeiten Sie erstmals in IntelliJ mit Java.
Achten Sie auf die Code-Konventionen, wenden Sie jeweils die passenden Sichtbarkeitsmodifizierer an.
Hier sollen Sie eine Repräsentation für einen Zug (Klasse Zug) entwickeln der aus beliebig vielen Wagen
(Klasse Wagen) besteht. Ein Wagen hat eine Referenz auf den nachfolgenden Wagen, der Zug hat eine Referenz
auf den ersten Wagen. Ein Wagen hat außerdem eine Id (Typ String).
Hat der Zug keine Wägen oder ein Wagen keinen Nachfolger, dann ist die Referenz null.

### Wagen und Zug
> Schreiben Sie zunächst die beiden Klassen Zug und Wagen mit den notwendigen Methoden und Objektvariablen.
Implementieren Sie die notwendigen Getter und (falls wirklich notwendig) Setter für die Felder.
Die IDs für die Wagen sollen automatisch im Konstruktor gesetzt werden und eindeutig sein.

### Wagen anhängen
> Schreiben Sie in Zug eine Methode void anhaengen (Wagen neuerWagen), die einen Wagen am Ende des Zuges anhängt.
Die Methode soll iterativ (also mit einer Schleife) arbeiten. Denken Sie an das Testen.

### Wagen abhängen
> Schreiben Sie in Zug eine Methode boolean abhaengen (Wagen wagen),
die einen beliebigen Wagen aus dem Zug abhängt und dabei wieder iterativ vorgeht.
Der Wagen kann der erste sein, zwischen anderen Wagen oder am Ende der Zuges hängen.
Theoretisch kann es auch sein, dass der Wagen gar nicht im Zug hängt.
Wagen, die hinter dem abgehängten Wagen sind, werden an den Vorgänger des abgehängten Wagens gehängt.
Der abgehängte Wagen hat im Anschluss natürlich keinen Nachfolger (mehr).
Die Methode gibt wahr zurück, wenn das Abhängen geklappt hat, ansonsten falsch.
Schreiben Sie einen passenden Test, vergessen Sie dabei die Sonderfälle nicht.

### Debugger
> Bereiten Sie sich darauf vor, die Methoden mit Hilfe des IntelliJ-Debuggers präsentieren zu können.
Hinweis zumTesten:
Hier testen Sie nicht nur Rückgabewerte von Methoden sondern auch den Zustand der Objekte.

### Beispiel:
> Fügen Sie an einen leeren Zug einen Wagen an, dann prüfen Sie im Anschluss,
ob der Wagen im Zug ist und der Zug insgesamt aus einem Wagen besteht.

### Tip:
> Fällt es Ihnen schwer, sich auszumalen, wie die Referenzen in Ihren Objekten aussehen, dann helfen oft Skizzen.