#  Iterates through immediate subfolders, deleting LaTeX-generated helper files.
#  Assumes latexmk is installed.

dirlist=$( find $1 -mindepth 1 -maxdepth 1 -type d -not -path "./.git"  )

for dir in $dirlist
do
  (
  cd $dir
  printf "Performing cleanup in %s\n" "$dir"
  latexmk -c -quiet
  rm -rf _minted-*
  rm -f *.nav
  rm -f *.snm
  rm -f *.vrb
  rm -f *.backup
  )
done
