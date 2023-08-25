.class public final synthetic Lcom/daaw/a60;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ww1$a;


# static fields
.field public static final synthetic a:Lcom/daaw/a60;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/a60;

    invoke-direct {v0}, Lcom/daaw/a60;-><init>()V

    sput-object v0, Lcom/daaw/a60;->a:Lcom/daaw/a60;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lcom/daaw/c60;->c(Ljava/lang/Object;)Ljava/io/File;

    move-result-object p1

    return-object p1
.end method
