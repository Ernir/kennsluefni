Hér má finna ýmist efni sem Eiríkur Ernir Þorsteinsson hefur notað við kennslu.

Þegar villur finnast í efninu má tilkynna það í gegnum issue-kerfið á þessari síðu.

Þriðji aðili má nota efnið, sjá LEYFI.md.

# Þýðing

Kennsluefnið er að mestu leyti sett fram á [LaTeX](https://en.wikipedia.org/wiki/LaTeX) sniði. Sniðið er hrátextasnið sem þarfnast þýðingar. Útkoman er safn .pdf skráa.

Gefnar eru [make](https://en.wikipedia.org/wiki/Make_(software)) skrár til að aðstoða við þýðingu.

Make skrárnar gera ráð fyrir að hjálparforritið `latexmk` sé uppsett, auk eðlilegra LaTeX-pakka. Á Ubuntu má setja upp `latexmk` með skipuninni `sudo apt-get install latexmk`.

Að öllum forkröfum uppfylltum má þýða allt kennsluefnið með því að gefa skipunina

```
make
```

í þessari rótarmöppu. Einnig má keyra skipunina í undirmöppu einhvers ákveðins námskeiðs til að þýða eingöngu kennsluefni þess námskeiðs.