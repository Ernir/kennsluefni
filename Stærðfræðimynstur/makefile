neatbuild:
	$(MAKE) build
	$(MAKE) cleanjunk
	
build:
	latexmk -pdf -quiet -pdflatex="pdflatex -shell-escape"

clean: cleanjunk
	-rm -f *.pdf

cleanjunk:
	latexmk -c -quiet
	-rm -rf _minted-*
	-rm -f *.nav
	-rm -f *.snm
	-rm -f *.vrb
	-rm -f *.backup
	-rm -f *.synctex.gz
	-rm -f *.log
