import { Routes } from '@angular/router';

import { FuncionarioComponent } from './funcionario/funcionario.component';
import { ProdutoComponent } from './produto/produto.component';
import { FormFuncionarioComponent } from './form-funcionario/form-funcionario.component';
import { FormProdutoComponent } from './form-produto/form-produto.component';
import { EstoqueComponent } from './estoque/estoque.component';
import { FormEstoqueComponent } from './form-estoque/form-estoque.component';
import { ClienteComponent } from './cliente/cliente.component';
import { FormClienteComponent } from './form-cliente/form-cliente.component';
import { FornecedorComponent } from './fornecedor/fornecedor.component';

export const routes: Routes = [
    {path: 'funcionarios', component: FuncionarioComponent},
    {path: 'funcionarios/novo', component: FormFuncionarioComponent},
    {path: 'funcionarios/alterar/:id', component: FormFuncionarioComponent},
    {path: 'produtos', component: ProdutoComponent},
    {path: 'produtos/novo', component: FormProdutoComponent},
    {path: 'produtos/alterar/:id', component: FormProdutoComponent},
    {path: 'estoque', component: EstoqueComponent},
    {path: 'estoque/novo', component: FormEstoqueComponent},
    {path: 'estoque/alterar/:id', component: FormEstoqueComponent},
    {path: 'clientes', component: ClienteComponent},
    {path: 'clientes/novo', component: FormClienteComponent},
    {path: 'fornecedores', component: FornecedorComponent},
];

