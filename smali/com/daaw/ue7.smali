.class public Lcom/daaw/ue7;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/dq7;

.field public final b:Ljava/lang/Class;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/dq7;Ljava/lang/Class;Lcom/daaw/te7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ue7;->a:Lcom/daaw/dq7;

    iput-object p2, p0, Lcom/daaw/ue7;->b:Ljava/lang/Class;

    return-void
.end method

.method public static a(Lcom/daaw/se7;Lcom/daaw/dq7;Ljava/lang/Class;)Lcom/daaw/ue7;
    .locals 1

    new-instance v0, Lcom/daaw/re7;

    invoke-direct {v0, p1, p2, p0}, Lcom/daaw/re7;-><init>(Lcom/daaw/dq7;Ljava/lang/Class;Lcom/daaw/se7;)V

    return-object v0
.end method


# virtual methods
.method public final b()Lcom/daaw/dq7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ue7;->a:Lcom/daaw/dq7;

    return-object v0
.end method

.method public final c()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ue7;->b:Ljava/lang/Class;

    return-object v0
.end method
