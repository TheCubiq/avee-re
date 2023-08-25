.class public Lcom/daaw/z31;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/de0;


# instance fields
.field public a:[S

.field public b:Lcom/daaw/vc;

.field public c:Lcom/daaw/x31;

.field public d:Lcom/daaw/aq0;

.field public e:Landroid/graphics/Bitmap;

.field public f:Lcom/daaw/sg0;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x3e9

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/daaw/z31;->a:[S

    new-instance v0, Lcom/daaw/z31$a;

    invoke-direct {v0, p0}, Lcom/daaw/z31$a;-><init>(Lcom/daaw/z31;)V

    iput-object v0, p0, Lcom/daaw/z31;->f:Lcom/daaw/sg0;

    new-instance v0, Lcom/daaw/aq0;

    invoke-direct {v0, p0}, Lcom/daaw/aq0;-><init>(Lcom/daaw/de0;)V

    iput-object v0, p0, Lcom/daaw/z31;->d:Lcom/daaw/aq0;

    new-instance v0, Lcom/daaw/vc;

    invoke-direct {v0}, Lcom/daaw/vc;-><init>()V

    iput-object v0, p0, Lcom/daaw/z31;->b:Lcom/daaw/vc;

    new-instance v0, Lcom/daaw/x31;

    iget-object v1, p0, Lcom/daaw/z31;->d:Lcom/daaw/aq0;

    iget-object v2, p0, Lcom/daaw/z31;->f:Lcom/daaw/sg0;

    invoke-direct {v0, v1, v2}, Lcom/daaw/x31;-><init>(Lcom/daaw/aq0;Lcom/daaw/sg0;)V

    iput-object v0, p0, Lcom/daaw/z31;->c:Lcom/daaw/x31;

    return-void

    nop

    :array_0
    .array-data 2
        0xc23s
        0xfbas
        0x22c3s
        0x33c6s
        0x2791s
        0x1687s
        0x1348s
        0x2e14s
        0x4487s
        0x2edes
        0x1052s
        -0x480s
        -0xds
        0x4acs
        0x95s
        0xe2s
        0x84es
        0x1a45s
        0x258bs
        0x27dds
        0x1ce9s
        0x1581s
        0x1bebs
        0x1f21s
        0x17dbs
        0x4d8s
        -0x17s
        0xb1ds
        0x16abs
        0x1457s
        0x740s
        0x249s
        0x96fs
        0x19cbs
        0x141es
        0x238s
        -0x6b6s
        0xb1bs
        0x2dcas
        0x2ef1s
        0x1e16s
        0xb3bs
        0x784s
        0xacfs
        0xf5ds
        0x6cbs
        -0x29s
        0x363s
        0x199cs
        0x3883s
        0x3145s
        0x1da6s
        0xfc0s
        0x135as
        0x1dc4s
        0x282ds
        0x1e8bs
        0x7c4s
        -0xd7s
        0x543s
        0x17e3s
        0xdfbs
        -0x79bs
        -0x1a62s
        -0x2008s
        -0x16f0s
        -0xc6bs
        -0xafes
        -0x13f6s
        -0x13d6s
        -0x8ccs
        0xa36s
        0x985s
        0x8cs
        -0x5cfs
        -0x1636s
        -0x2e91s
        -0x436ds
        -0x40c7s
        -0x20e3s
        -0x163bs
        -0x2022s
        -0x328fs
        -0x3b8bs
        -0x36e6s
        -0x3046s
        -0x2676s
        -0x195as
        -0x136bs
        -0x1224s
        -0xf5as
        -0xe05s
        -0x1496s
        -0x1c31s
        -0x258ds
        -0x28f5s
        -0x2143s
        -0x17a5s
        -0x103es
        -0x16f5s
        -0x2390s
        -0x2c3es
        -0x2902s
        -0x1cces
        -0xabbs
        -0x497s
        -0x1088s
        -0x20d3s
        -0x2a5fs
        -0x1c96s
        -0x1249s
        -0xb61s
        -0x18bfs
        -0x231cs
        -0x2474s
        -0x26e9s
        -0x2e70s
        -0x460bs
        -0x4b8cs
        -0x3ce3s
        -0x190bs
        -0x5des
        -0x13d0s
        -0x26e4s
        -0x3632s
        -0x3382s
        -0x3a81s
        -0x43f3s
        -0x3b91s
        -0x2a85s
        -0x1989s
        -0x2102s
        -0x2e2cs
        -0x3803s
        -0x3a42s
        -0x433es
        -0x4b4es
        -0x4901s
        -0x3ffbs
        -0x3fbes
        -0x4bdas
        -0x50d9s
        -0x50a9s
        -0x4f27s
        -0x5493s
        -0x5ab5s
        -0x561as
        -0x4c6bs
        -0x4d4cs
        -0x5306s
        -0x537as
        -0x5019s
        -0x4e7cs
        -0x4d4cs
        -0x4a27s
        -0x4b14s
        -0x48cbs
        -0x3b67s
        -0x32d3s
        -0x4609s
        -0x6e3bs
        -0x676cs
        -0x442es
        -0x2209s
        -0x2e01s
        -0x4e83s
        -0x5e2es
        -0x5dcfs
        -0x4c10s
        -0x5147s
        -0x5dabs
        -0x6179s
        -0x4c9cs
        -0x2e3bs
        -0x285ds
        -0x4129s
        -0x615bs
        -0x5dc8s
        -0x5203s
        -0x4bd3s
        -0x5cd5s
        -0x6feas
        -0x5f33s
        -0x4156s
        -0x2cb6s
        -0x468ds
        -0x6520s
        -0x6bd2s
        -0x62d2s
        -0x5db4s
        -0x680cs
        -0x742cs
        -0x73c0s
        -0x584bs
        -0x48c3s
        -0x49a7s
        -0x581as
        -0x6414s
        -0x5c65s
        -0x5e55s
        -0x653fs
        -0x69d2s
        -0x5e44s
        -0x4439s
        -0x3d7as
        -0x47c0s
        -0x656bs
        -0x716fs
        -0x6d05s
        -0x5b8as
        -0x5076s
        -0x4f98s
        -0x58a1s
        -0x60bfs
        -0x6284s
        -0x6e47s
        -0x768cs
        -0x7855s
        -0x63dcs
        -0x45c0s
        -0x38f2s
        -0x44fes
        -0x5f94s
        -0x70a6s
        -0x7894s
        -0x7a17s
        -0x7a94s
        -0x7bffs
        -0x7a0fs
        -0x7507s
        -0x6b0bs
        -0x66efs
        -0x663bs
        -0x64a0s
        -0x5ffbs
        -0x5798s
        -0x5266s
        -0x4c9fs
        -0x482cs
        -0x4f37s
        -0x5f24s
        -0x7090s
        -0x5cdcs
        -0x3dc8s
        -0x2b51s
        -0x368es
        -0x4bb3s
        -0x50fes
        -0x4cfbs
        -0x4390s
        -0x4113s
        -0x4781s
        -0x5b60s
        -0x5085s
        -0x340as
        -0x205cs
        -0x2510s
        -0x3817s
        -0x3f90s
        -0x4046s
        -0x3b99s
        -0x3be2s
        -0x3a28s
        -0x316as
        -0x22d9s
        -0x117bs
        -0x147es
        -0x1e3as
        -0x2772s
        -0x3d6fs
        -0x4edbs
        -0x4880s
        -0x346cs
        -0x2701s
        -0x3848s
        -0x4667s
        -0x47c2s
        -0x41d7s
        -0x3f2bs
        -0x43bcs
        -0x40a8s
        -0x346bs
        -0x2297s
        -0x1dccs
        -0x2487s
        -0x2b0fs
        -0x312cs
        -0x36a4s
        -0x4410s
        -0x4ae5s
        -0x3822s
        -0x2ab2s
        -0x2720s
        -0x3582s
        -0x3fb0s
        -0x39ffs
        -0x31fes
        -0x27f2s
        -0x1e01s
        -0x191as
        -0x1cees
        -0x24c7s
        -0x232fs
        -0x160fs
        -0x1032s
        -0x13cfs
        -0x1d0ds
        -0x1c1fs
        -0x17cas
        -0x13c6s
        -0x191bs
        -0x2387s
        -0x2a04s
        -0x2ea3s
        -0x314fs
        -0x3776s
        -0x3babs
        -0x3aa7s
        -0x2fc9s
        -0x227es
        -0x1d94s
        -0x1f4ds
        -0x2128s
        -0x1adfs
        -0x155bs
        -0xf56s
        -0x8ebs
        -0x13as
        -0x82s
        -0x69fs
        -0x122ds
        -0x1d58s
        -0x234cs
        -0x21d1s
        -0x243bs
        -0x2820s
        -0x2e7cs
        -0x2659s
        -0x1111s
        -0x221s
        -0x24bs
        -0xbacs
        -0xcf2s
        -0xc1bs
        -0x1423s
        -0x14a3s
        -0xe30s
        -0x474s
        -0xab9s
        -0x1afds
        -0x2383s
        -0x1e12s
        -0x13eds
        -0xbcbs
        -0x558s
        -0x51cs
        -0x4b2s
        -0x4b3s
        0x212s
        0x85ds
        0xa49s
        0x5c2s
        -0x2efs
        -0xbbbs
        -0x1a7as
        -0x269cs
        -0x22f1s
        -0x1a68s
        -0x1000s
        -0x1345s
        -0x1505s
        -0x1234s
        -0x18d4s
        -0x2792s
        -0x35b6s
        -0x31f8s
        -0x1cd3s
        -0x14aes
        -0x172fs
        -0x25f1s
        -0x3474s
        -0x3460s
        -0x2807s
        -0x1fa2s
        -0x2319s
        -0x2dd7s
        -0x30bes
        -0x2302s
        -0x1f40s
        -0x1f88s
        -0x16bfs
        -0x17ccs
        -0x21fas
        -0x2bb6s
        -0x2b11s
        -0x1c4fs
        -0x1570s
        -0x1192s
        -0x1016s
        -0x12c9s
        -0x1686s
        -0x196bs
        -0x1a16s
        -0x1829s
        -0x189fs
        -0x1980s
        -0x186cs
        -0x9eds
        0x624s
        0xc43s
        -0x6fs
        -0x1310s
        -0x1b79s
        -0x1b9fs
        -0x15des
        -0x1152s
        -0xab6s
        -0xab6s
        -0x1391s
        -0x2116s
        -0x2676s
        -0x21e7s
        -0x1a75s
        -0x15aas
        -0x19bes
        -0x1fbds
        -0x1d1es
        -0x14c0s
        -0x1002s
        -0x17a2s
        -0x204fs
        -0x1fe3s
        -0x1c95s
        -0x15e0s
        -0x1ea8s
        -0x2babs
        -0x35d8s
        -0x30ads
        -0x1982s
        -0x1327s
        -0x1bf0s
        -0x2d8cs
        -0x2c8cs
        -0x23e4s
        -0x28c3s
        -0x32f7s
        -0x304ds
        -0x1b94s
        -0x12aas
        -0x1458s
        -0x22f4s
        -0x3260s
        -0x2ff9s
        -0x22c4s
        -0x1700s
        -0x195cs
        -0x24b6s
        -0x2b14s
        -0x120as
        0x568s
        0x76s
        -0x124bs
        -0x2278s
        -0x21c6s
        -0x19d0s
        -0xe44s
        -0x14a7s
        -0x1fb8s
        -0x1a56s
        0x475s
        0x19d8s
        0xdeds
        0x18bs
        -0x7b9s
        -0xd22s
        -0x13bbs
        -0x17d2s
        -0x14eas
        -0x134cs
        -0x10e6s
        -0xb26s
        -0x456s
        -0xff7s
        -0x205es
        -0x24d4s
        -0x682s
        0x157es
        0x146ds
        0x155s
        -0x109fs
        -0xb3ds
        -0x8b8s
        -0xf74s
        -0x112as
        -0xd9cs
        0x194s
        0xdb6s
        0x121as
        0xbbes
        -0x2f0s
        -0xe14s
        -0x892s
        0xa0ds
        0x2014s
        0x2096s
        0x12a8s
        -0x1e7s
        -0xb85s
        -0x97fs
        0x285s
        0x844s
        -0xbas
        -0xa22s
        -0x9f9s
        0x6d5s
        0xe20s
        0xea7s
        0x107es
        0x1b23s
        0x232ds
        0x1d51s
        0x1543s
        0xecbs
        0xba3s
        0x70fs
        -0x6ccs
        -0xf4as
        -0x1103s
        -0xcf2s
        -0x968s
        -0xb66s
        -0x14e5s
        -0x194as
        -0x1277s
        0xb75s
        0x284es
        0x2cd8s
        0x1a63s
        0x88bs
        0x9b5s
        0x1af2s
        0x2fc5s
        0x3700s
        0x3178s
        0x276es
        0x2c1fs
        0x3b7cs
        0x3f1ds
        0x3691s
        0x2bafs
        0x304bs
        0x3f7cs
        0x43b5s
        0x3a08s
        0x2f0cs
        0x2f8as
        0x3083s
        0x2dacs
        0x27a5s
        0x2bbds
        0x394bs
        0x409es
        0x4227s
        0x4168s
        0x41a3s
        0x42f1s
        0x4fb3s
        0x5ce5s
        0x5bc5s
        0x4be2s
        0x43c3s
        0x4d5as
        0x5530s
        0x5a11s
        0x51a5s
        0x414cs
        0x3835s
        0x349as
        0x3277s
        0x3413s
        0x3bdes
        0x4201s
        0x43c9s
        0x3e8es
        0x39c2s
        0x5034s
        0x6288s
        0x6114s
        0x5104s
        0x4264s
        0x4b2cs
        0x4ef4s
        0x4bd3s
        0x41b5s
        0x3fb0s
        0x51efs
        0x644ds
        0x6ee3s
        0x63b0s
        0x5b87s
        0x5b1es
        0x6196s
        0x67bfs
        0x6ca7s
        0x7400s
        0x75d2s
        0x6d01s
        0x63cas
        0x6331s
        0x7713s
        0x7ef8s
        0x77e6s
        0x61b7s
        0x5189s
        0x4c99s
        0x47fds
        0x444ds
        0x4619s
        0x4c6es
        0x559ds
        0x5679s
        0x49d9s
        0x3578s
        0x3f3es
        0x57b5s
        0x6dd2s
        0x6d4bs
        0x6255s
        0x6229s
        0x6386s
        0x61bbs
        0x57fcs
        0x506cs
        0x5207s
        0x5c37s
        0x637cs
        0x5a7ds
        0x562as
        0x58d1s
        0x5d1as
        0x6068s
        0x60d7s
        0x699as
        0x7553s
        0x7d98s
        0x7cebs
        0x7595s
        0x689cs
        0x5de2s
        0x56c2s
        0x539ds
        0x55afs
        0x5c79s
        0x5cb8s
        0x5638s
        0x4ac4s
        0x4772s
        0x4ca4s
        0x58des
        0x5bfes
        0x4eb5s
        0x466bs
        0x42b8s
        0x44b3s
        0x40d0s
        0x371es
        0x321cs
        0x319es
        0x3436s
        0x3128s
        0x2dc6s
        0x29c1s
        0x29d5s
        0x2e0bs
        0x332cs
        0x3608s
        0x31f7s
        0x294cs
        0x21f1s
        0x1baes
        0x17b7s
        0x15f3s
        0x1730s
        0x1620s
        0x1252s
        0x11ccs
        0x15bbs
        0x1c76s
        0x20f2s
        0x256es
        0x2c45s
        0x326cs
        0x3794s
        0x3a8bs
        0x3b10s
        0x3ae2s
        0x390cs
        0x3b9cs
        0x417bs
        0x466as
        0x4936s
        0x4aads
        0x4244s
        0x33e8s
        0x30c1s
        0x3b05s
        0x5160s
        0x531ds
        0x46f7s
        0x37e9s
        0x3112s
        0x3387s
        0x38eds
        0x3c8bs
        0x38fbs
        0x3224s
        0x2dc8s
        0x2f88s
        0x309es
        0x31c1s
        0x31fas
        0x3805s
        0x444bs
        0x5038s
        0x5809s
        0x5472s
        0x5137s
        0x4b2es
        0x4350s
        0x331es
        0x2012s
        0x1d77s
        0x275as
        0x3bc0s
        0x3d1fs
        0x32ces
        0x29d8s
        0x27dcs
        0x2b03s
        0x2a87s
        0x25fas
        0x1f6bs
        0x23f6s
        0x2aces
        0x33f6s
        0x31c1s
        0x2412s
        0x1183s
        0x326s
        0xces
        0x1389s
        0x22c1s
        0x1fd4s
        0x19fcs
        0x187fs
        0x227fs
        0x280ds
        0x2871s
        0x2334s
        0x2225s
        0x29b8s
        0x33des
        0x3a2cs
        0x3141s
        0x2ad2s
        0x29c7s
        0x28bfs
        0x2a78s
        0x2efcs
        0x36bfs
        0x4080s
        0x4517s
        0x43ces
        0x3c9as
        0x372as
        0x31f6s
        0x2cces
        0x2d02s
        0x2ae9s
        0x2923s
        0x2301s
        0x1f6bs
        0x1f40s
        0x2216s
        0x2472s
        0x2056s
        0x1c60s
        0x15c6s
        0x1e4ds
        0x299es
        0x29bfs
        0x20aes
        0x1180s
        0xb96s
        0xd36s
        0xfebs
        0x5b8s
        -0x6e3s
        -0x9d8s
        0x1es
        0xae8s
        0x354s
        -0x31as
        -0x1bcs
        0x78es
        0x1048s
        0x1106s
        0xeees
        0xf38s
        0x1b57s
        0x1e51s
        0x1781s
        0x981s
        0x1b3s
        0x18bs
        -0x207s
        -0x34as
        0x3bes
        0x4d4s
        -0x4b9s
        -0x16d0s
        -0x26ccs
        -0x31f0s
        -0x3476s
        -0x32fas
        -0x2f2es
        -0x2bdbs
        -0x259fs
        -0x183es
        -0xe07s
        -0xa51s
        -0x5e9s
        0x46cs
        0x15b9s
        0x19a2s
        0x1354s
        0x8cas
        0x3a5s
        0x55as
        0x97cs
        0xd22s
        0xdb7s
        0xf09s
        0x107fs
        0x1011s
        0xaeds
        0xa98s
        0x18bes
        0x28fds
        0x2efes
        0x2b81s
        0x270fs
        0x284as
        0x21bfs
        0x1715s
        0xe09s
        0x10c8s
        0x1a87s
        0x1b15s
        0x1513s
        0xcd6s
        0xc57s
        0x121cs
        0x15b5s
        0x1a9ds
        0x2104s
        0x256cs
        0x23ebs
        0x1d18s
        0x1b36s
        0x1e36s
        0x268bs
        0x243ds
        0x1d24s
        0x1c0es
        0x1b00s
        0x172cs
        0xd77s
        0xades
        0x1770s
        0x2579s
        0x2e16s
        0x2afcs
        0x261es
        0x2285s
        0x2264s
        0x1ec8s
        0x1577s
        0x1590s
        0x1f8es
        0x2e82s
        0x3014s
        0x259cs
        0x1b73s
        0x18d0s
        0x204es
        0x27c8s
        0x2581s
        0x1880s
        0x12cas
        0x1a86s
        0x2d22s
        0x2ec8s
        0x1eacs
        0x107es
        0xbe7s
        0xf76s
        0x1606s
        0x187cs
        0x1513s
        0xe44s
        0x867s
        0x4f6s
        0x61fs
        0xb63s
        0xdf6s
        0x9aes
        -0x4aes
        -0x627s
        -0x71s
        0x4afs
        0x624s
        0x9d3s
        0x133bs
        0x21c5s
        0x3232s
        0x30f7s
        0x27b7s
        0x1deds
        0x1a8es
        0x1c92s
        0x1970s
        0x1405s
        0xaf7s
        0x486s
        0xaacs
        0x1bf9s
        0x28d8s
        0x30b8s
        0x2e05s
        0x27b0s
        0x1f29s
        0x17cas
        0x174fs
        0x2236s
        0x25f0s
        0x1eeds
        0x17c1s
        0x14fbs
        0x17dds
        0x2220s
        0x2a57s
        0x2160s
        0x1dc3s
        0x20bfs
        0x280ds
        0x243bs
        0x1539s
        0x1146s
        0x16b1s
        0x17cfs
        0xabcs
        -0x663s
        -0x1175s
        -0xbbds
        0xe9s
        0x80ds
        0xbf2s
        0xaa8s
        0xb80s
        0x659s
        0x132s
        0x4as
        0x82s
        -0xb18s
        -0x1125s
        -0xddbs
        -0x5e9s
        -0x3e8s
        -0x1151s
        -0x1d65s
        -0x2908s
        -0x34c3s
        -0x36abs
        -0x2e11s
        -0x1844s
        -0x461s
        0x1fcs
        -0x14bs
        -0xb8fs
        -0x1167s
        -0x10afs
        -0xe04s
        -0x125as
        -0x137cs
        -0xf46s
        -0x6f6s
        -0x461s
        -0x1184s
        -0x1d27s
        -0x25eas
    .end array-data
.end method

.method public static synthetic k(Lcom/daaw/z31;I)Lcom/daaw/avee/comp/playback/a;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/z31;->l(I)Lcom/daaw/avee/comp/playback/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/z31;->e:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b()Lcom/daaw/de0$a;
    .locals 1

    iget-object v0, p0, Lcom/daaw/z31;->c:Lcom/daaw/x31;

    return-object v0
.end method

.method public c()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public d()F
    .locals 1

    const v0, 0x3dcccccd    # 0.1f

    return v0
.end method

.method public e(I)V
    .locals 0

    return-void
.end method

.method public f()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/z31;->e:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public g()F
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public i(Lcom/daaw/e40;)V
    .locals 0

    return-void
.end method

.method public j()Lcom/daaw/sc0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/z31;->b:Lcom/daaw/vc;

    return-object v0
.end method

.method public final l(I)Lcom/daaw/avee/comp/playback/a;
    .locals 7

    new-instance v0, Lcom/daaw/avee/comp/playback/a;

    invoke-direct {v0}, Lcom/daaw/avee/comp/playback/a;-><init>()V

    const v1, 0xac44

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2, p1, p1}, Lcom/daaw/avee/comp/playback/a;->d(IIII)V

    const/4 p1, 0x0

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/a;->b()I

    move-result v2

    const/4 v3, 0x1

    if-ge v1, v2, :cond_2

    iget-object v2, p0, Lcom/daaw/z31;->a:[S

    array-length v4, v2

    rem-int v4, v1, v4

    aget-short v2, v2, v4

    mul-int/lit8 v2, v2, 0x1

    mul-int/lit8 v2, v2, 0x1

    int-to-short v2, v2

    iget-object v4, v0, Lcom/daaw/avee/comp/playback/a;->c:[S

    iget v5, v0, Lcom/daaw/avee/comp/playback/a;->b:I

    mul-int v6, v1, v5

    aput-short v2, v4, v6

    mul-int v6, v1, v5

    add-int/2addr v6, v3

    aput-short v2, v4, v6

    iget-short v3, v0, Lcom/daaw/avee/comp/playback/a;->d:S

    if-le v3, v2, :cond_0

    iput-short v2, v0, Lcom/daaw/avee/comp/playback/a;->d:S

    :cond_0
    iget-short v3, v0, Lcom/daaw/avee/comp/playback/a;->e:S

    if-ge v3, v2, :cond_1

    iput-short v2, v0, Lcom/daaw/avee/comp/playback/a;->e:S

    :cond_1
    mul-int v5, v5, v1

    aget-short v2, v4, v5

    int-to-float v2, v2

    const/high16 v3, 0x437f0000    # 255.0f

    div-float/2addr v2, v3

    add-float/2addr p1, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/a;->b()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr p1, v1

    iput p1, v0, Lcom/daaw/avee/comp/playback/a;->g:F

    iput-boolean v3, v0, Lcom/daaw/avee/comp/playback/a;->a:Z

    return-object v0
.end method

.method public m()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/z31;->d:Lcom/daaw/aq0;

    invoke-virtual {v0}, Lcom/daaw/aq0;->o()V

    return-void
.end method

.method public n(Landroid/graphics/Bitmap;)V
    .locals 2

    iput-object p1, p0, Lcom/daaw/z31;->e:Landroid/graphics/Bitmap;

    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0, p1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    sget-object p1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    iget-object p1, p0, Lcom/daaw/z31;->b:Lcom/daaw/vc;

    invoke-virtual {p1, v0}, Lcom/daaw/vc;->h(Landroid/graphics/Canvas;)V

    return-void
.end method
