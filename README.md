# VIM Money Troll

Ever get jealous of your ST2 friends constantly dismissing subscription reminder popups?

![VIM-money-troll](https://s3-eu-west-1.amazonaws.com/vim-money-troll/vim-money-troll.png)

Well VIM Money Troll is here to help.  Impress your non-vim friends with this realistic popup.

## Installation instructions

    git clone git@github.com:emileswarts/vim-money-troll.git ~/.vim/bundle/

In your .vimrc, add the following.

    nnoremap <leader>g :silent !java -classpath /Users/<name>/.vim/bundle/vim-money/ BegForMoney<CR>

### Todo
  Have the popup open every time you save a file, or try exit.
