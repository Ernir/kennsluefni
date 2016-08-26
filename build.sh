#  Iterates through immediate subfolders, deleting LaTeX-generated helper files.
#  Assumes latexmk is installed.

dirlist=$( find $1 -mindepth 1 -maxdepth 1 -type d -not -path "./.git"  )

for dir in $dirlist
do
  (
  cd $dir
  printf "Compiling all .tex files in %s\n" "$dir"
  latexmk -pdf -quiet -pdflatex="pdflatex -shell-escape"
  )
done

