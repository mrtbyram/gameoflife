if [ $TRAVIS_BRANCH == 'dev' ]
then
  git clone --depth=5 https://github.com/mrtbyram/gameoflife.git mrtbyram/gameoflife/release
  cd mrtbyram/gameoflife/release
  git checkout master
  git rebase dev
  git push
  echo DEV MERGED TO MASTER
fi