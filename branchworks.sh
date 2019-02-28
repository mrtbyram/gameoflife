if [ $TRAVIS_BRANCH == 'dev' ]
then
  git clone --depth=5 https://$gituser:$gitpass@github.com/mrtbyram/gameoflife.git mrtbyram/gameoflife/release
  cd mrtbyram/gameoflife/release
  git checkout master
  git merge remotes/origin/dev
  git remote set-url origin https://$gituser:$gitpass@github.com/mrtbyram/gameoflife.git/
  git push
  echo DEV MERGED TO MASTER
fi
