import logo from '../../assets/img/logo.svg'
import './styles.css'

function Header() {
    return (
        <header>
            <div className="salesgoal-logo-container">
                <img src={logo} alt="SalesGoal" />
                <h1>Sales Goal</h1>
            </div>
        </header>
    )
}

export default Header