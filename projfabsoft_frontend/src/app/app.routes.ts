import { Routes } from '@angular/router';
import { FuncionarioComponent } from './funcionario/funcionario.component';
import { ProdutoComponent } from './produto/produto.component';
import { FormFuncionarioComponent } from './form-funcionario/form-funcionario.component';
import { FormProdutoComponent } from './form-produto/form-produto.component';

export const routes: Routes = [
    {path: 'funcionarios', component: FuncionarioComponent},
    {path: 'produtos', component: ProdutoComponent},
    {path: 'funcionarios/novo', component: FormFuncionarioComponent},
    {path: 'produtos/novo', component: FormProdutoComponent}
];
