Hér má finna ýmist efni sem Eiríkur Ernir Þorsteinsson hefur notað við kennslu.

Þegar villur finnast í efninu má tilkynna það í gegnum issue-kerfið á þessari síðu.

Þriðji aðili má nota efnið, sjá LEYFI.md.


=======
Keyrsla
=======

Gefnar eru eftirfarandi Unix-skipanaskrár til að þýða LaTeX-grunnskrárnar:

  * `build.sh`, sem túlkar allar .tex skrár í 1. stigs undirmöppum.
  * `cleanup.sh`, sem hreinsar upp hið ýmsa subb sem LaTeX þýðandinn býr til í undirmöppunum.

Báðar skipanaskrárnar gera ráð fyrir að hjálparforritið `latexmk` sé uppsett, auk, eðlilegra LaTeX-pakka.

Á Ubuntu má setja upp `latexmk` með skipuninni `sudo apt-get install latexmk`.